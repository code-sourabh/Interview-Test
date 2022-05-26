import React, { useContext } from 'react'
import { UserProvider } from '../../App'

const Profile = () => {
  const user = useContext(UserProvider)
  return <div>{JSON.stringify(user)}</div>
}

export default Profile
