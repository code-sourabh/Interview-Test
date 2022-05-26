import React, { useContext, useState } from 'react'
import './home.scss'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'
import { UserProvider } from '../../App'

const Home = () => {
  const [search, setSearch] = useState('')
  const [error, setError] = useState(false)
  const [blur, setBlur] = useState(false)
  const { setUser } = useContext(UserProvider)
  const navigate = useNavigate()

  const submitHandler = () => {
    axios.get('http://localhost:8080/api/' + search).then(
      (response) => {
        if (response.data == null || !response.data)
          setError('username already taken')
        else {
          setUser(response.data)
          navigate('/' + search)
        }
      },
      (error) => {
        console.log(error)
      },
    )
  }

  return (
    <div className="body">
      <h1>Build your work portfolio</h1>
      <p>
        "Really like @Polywork's timeline-centric design-it's such a nicer, more
        modern way to surface your achievements over time.It gives you much
        better way to show other accomplishments that aren't just'I got a job at
        a place.""
      </p>

      <div class="input-box">
        <input
          autoFocus
          value={search}
          onChange={(e) => setSearch(e.target.value)}
          onBlur={() => setBlur(true)}
          placeholder="yournamehere"
        />

        <span className="unit">poly.work/</span>
        <button onClick={submitHandler}>Reserve</button>
      </div>
      {blur && (
        <span className="error" style={{ color: 'red' }}>
          {error}
        </span>
      )}
    </div>
  )
}

export default Home
