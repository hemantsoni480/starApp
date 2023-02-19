using Login.Model;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.IdentityModel.Tokens;
using System.Data;
using System.Data.SqlClient;
using System.IdentityModel.Tokens.Jwt;
using System.Net.Mail;
using System.Security.Claims;
using System.Text;

namespace Login.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class RegistartionController : ControllerBase
    {
        private readonly IConfiguration _configuration;

        public RegistartionController(IConfiguration configuration)
        {
            _configuration = configuration; 
        }
        [HttpPost]
        [Route("Registartion")]
        public string registration(Registartion registartion)   
        {

            SqlConnection conn = new SqlConnection(_configuration.GetConnectionString("Logcon").ToString());
            SqlCommand cmd = new SqlCommand("INSERT INTO Registration(userName,Password,Email,IsActive) VALUES('" + registartion.username+"','"+registartion.Password+"','"+registartion.Email+"','"+registartion.Isactive+"' )",conn);
            conn.Open();
            int i=cmd.ExecuteNonQuery();
            conn.Close();
            if (i > 0)
            {
                return "Data Inserted";
            }
            else
            {
                return "Error";
            }


        }
        [HttpPost("login")]
        public ActionResult<Registartion> Login(Registartion registartion)
        {
            

            SqlConnection conn = new SqlConnection(_configuration.GetConnectionString("Logcon").ToString());
            SqlDataAdapter da = new SqlDataAdapter("select * from Registration where username = '" +registartion.username+ "' AND Password = '" +registartion.Password+ "' ", conn);
            DataTable dt = new DataTable();
            da.Fill(dt);
        
            if (dt.Rows.Count>0)
            {
                string token = CreateToken(registartion);

                return Ok(new{token,registartion.username,registartion.Role});
            }
            else
            {
                return BadRequest("User not found.");
            }

         
        }

   
     

        private string CreateToken(Registartion registartion)
        {
            List<Claim> claims = new List<Claim> {
                new Claim(ClaimTypes.Name, registartion.username),
                new Claim(ClaimTypes.Role,"Admin"),
                new Claim(ClaimTypes.Role,"User"),
                new Claim(ClaimTypes.Role,"Manager"),
            };

            var key = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(
                _configuration.GetSection("AppSettings:Token").Value!));

            var creds = new SigningCredentials(key, SecurityAlgorithms.HmacSha512Signature);

            var token = new JwtSecurityToken(
                    claims: claims,
                    expires: DateTime.Now.AddDays(1),
                    signingCredentials: creds
                );

            var jwt = new JwtSecurityTokenHandler().WriteToken(token);

            return jwt;
        }

    }
}
