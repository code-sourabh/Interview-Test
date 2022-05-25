import React from 'react'
import { Link } from 'react-router-dom'
import { FaUserAlt } from 'react-icons/fa'
import './navbar.scss'

const Navbar = () => {
  return (
    <div className="navbar">
      <h2>Polywork</h2>
      <div className="navbar-body">
        <Link to="">Home</Link>
        <Link to="">People</Link>
        <Link to="">Opportunity</Link>
      </div>
      <div className="navbar-other-functions">
        <button className="join-polywork">Join Polywork</button>
        <div className="user-box ">
          <FaUserAlt />
        </div>
      </div>
    </div>
  )
}

export default Navbar
