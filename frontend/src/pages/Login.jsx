import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

export default function Login() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const navigate = useNavigate();

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post("/user/login", {
        email,
        password,
      });

      console.log(response.data); // user info
      // Save user for later use
      localStorage.setItem("user", JSON.stringify(response.data));

      // Redirect to dashboard
      navigate("/dashboard");

    } catch (err) {
      console.error(err);
      alert("Invalid credentials");
    }
  };

  return (
    <div className="auth-container">
      <div className="auth-box">

        <h2 className="auth-title">Login</h2>

        <form onSubmit={handleLogin}>
          <input
            type="email"
            className="auth-input"
            placeholder="Email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
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

          <button className="auth-btn" type="submit">
            Login
          </button>
        </form>

        <p className="auth-link">
          No account? <a href="/register">Register</a>
        </p>
      </div>
    </div>

  );
}
