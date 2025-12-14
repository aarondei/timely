import { useState } from "react";
import axios from "axios";

export default function Register() {
  const [firstname, setFirstname] = useState("");
  const [lastname, setLastname] = useState("");
  const [email, setEmail] = useState("");
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [role, setRole] = useState("STUDENT");

  const handleRegister = async (e) => {
    e.preventDefault();

    try {
      const res = await axios.post("/user/register", {
        firstname,
        lastname,
        email,
        password,
        role,
      });

      console.log(res.data);
      alert("Account created successfully!");
      window.location.href = "/login";

    } catch (err) {
      console.error(err);
      alert("Email already exists!");
    }
  };

  return (
    <div className="auth-container">
      <div className="auth-box">
        <h2 className="auth-title">Create Account</h2>

        <form onSubmit={handleRegister}>

          <select className="auth-select" value={role} onChange={(e) => setRole(e.target.value)}>
            <option value="STUDENT">Student</option>
            <option value="TEACHER">Teacher</option>
          </select>

          
          <input 
            type="text" 
            className="auth-input"
            placeholder="First Name"
            value={firstname}
            onChange={(e) => setFirstname(e.target.value)} 
            required 
          />

          <input 
            type="text" 
            className="auth-input"
            placeholder="Last Name"
            value={lastname}
            onChange={(e) => setLastname(e.target.value)} 
            required 
          />

          <input 
            type="email" 
            className="auth-input"
            placeholder="Email"
            value={email}
            onChange={(e) => setEmail(e.target.value)} 
            required 
          />

          <input 
              type="text"
              className="auth-input"
              placeholder="Username"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
              required
            />

          <input 
            type="password"
            className="auth-input"
            placeholder="Password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />

          

          <button type="submit" className="auth-btn">Register</button>
        </form>

        <p className="auth-link">
          Already have an account? <a href="/login">Login</a>
        </p>
      </div>
    </div>
  );
}
