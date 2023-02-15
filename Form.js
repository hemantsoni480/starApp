import React from 'react'

const Form = () => {
  return (
    <>
    <div id="carouselExampleFade" className="carousel slide carousel-fade">
  <div className="carousel-inner">
    <div className="carousel-item active">
      <img src="https://www.incedoinc.com/wp-content/uploads/incedo-belief-system-infographic.png" className="d-block w-100" alt="Core Values"/>
    </div>
    <div className="carousel-item">
      <img src="https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/caaba676209993.5c62ffc44385b.jpg" className="d-block w-100" alt="Core Values"/>
    </div>
    <div className="carousel-item">
      <img src="https://www.incedoinc.com/wp-content/uploads/incedo-belief-system-infographic.png" className="d-block w-100" alt="Core Values"/>
    </div>
  </div>
  <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
    <span className="carousel-control-prev-icon" aria-hidden="true"></span>
    <span className="visually-hidden">Previous</span>
  </button>
  <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
    <span className="carousel-control-next-icon" aria-hidden="true"></span>
    <span className="visually-hidden">Next</span>
  </button>
</div>

<form>
    <div className="Login_box">
    <a className="log">LOG IN</a>
     <div className="form-outline mb-4">
      <input type="email" id="form2Example1" className="form-control" />
      <label className="form-label" for="form2Example1">Enter User ID</label>
    </div> 
  
    
     <div className="form-outline mb-4">
      <input type="password" id="form2Example2" className="form-control" />
      <label className="form-label" for="form2Example2">Enter Password</label>
    </div> 
     <div className="row mb-4"> 
      <div className="col d-flex justify-content-center">
    </div>
      <button type="button" className="btn btn-primary btn-block mb-4 authenticate_btn">Authenticate</button>
      <div className="col"> 
        <a href="#!">Forgot password?</a>
      </div>
    </div>
    </div>
  </form> 
  </>
  )
}

export default Form
