import React, { useState } from 'react'
import Navbar from './Components/Navigation/Navbar'
import './global.scss'
import { Home, Profile } from './Pages/index'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'

export const UserProvider = React.createContext()

const App = () => {
  const [user, setUser] = useState(null)
  return (
    <UserProvider.Provider value={{ user, setUser }}>
      <Router>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} exact={true} />
          <Route path="/:username" element={<Profile />} exact={true} />
        </Routes>
      </Router>
    </UserProvider.Provider>
  )
}

export default App
