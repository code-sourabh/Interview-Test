import React from 'react'
import Navbar from './Components/Navigation/Navbar'
import './global.scss'
import { Home, Profile } from './Pages/index'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'

const App = () => {
  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} exact={true} />
        <Route path="/:username" element={<Profile />} exact={true} />
      </Routes>
    </Router>
  )
}

export default App
