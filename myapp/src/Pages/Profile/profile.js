import React, { useState, useEffect } from 'react'
import axios from 'axios'
import { useParams } from 'react-router-dom'

const Profile = () => {
  const [user, setUser] = useState({})
  const username = useParams().username
  useEffect(() => {
    axios.get('http://localhost:8080/api/' + username).then(
      (response) => setUser(response.data),
      (error) => console.log(error),
    )
  }, [])
  return <div>{JSON.stringify(user)}</div>
}

export default Profile
