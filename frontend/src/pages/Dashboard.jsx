import { useNavigate } from "react-router-dom";

export default function Dashboard() {
  const navigate = useNavigate();

  const handleGenerate = () => {
    alert("Schedule generator clicked!");
    // later: navigate("/generate-schedule");
  };

  const handleLogout = () => {
    localStorage.removeItem("user");
    navigate("/login");
  };

  return (
    <>
      {/* NAVIGATION */}
    <div className="dashboard">  
      <nav className="nav">
        <h2 className="nav-logo">Timely</h2>

        <div className="nav-links">
          <a href="/dashboard">Dashboard</a>
          <a href="/subjects">Subjects</a>
          <a href="/profile">Profile</a>
          <button className="logout-btn" onClick={handleLogout}>
            Logout
          </button>
        </div>
      </nav>

      {/* MAIN CONTENT */}
      <div className="content">
            <h1 className="dashboard-title">Welcome Back!</h1>
            <button className="generate-btn" onClick={handleGenerate}>
            Generate Schedule
            </button>
        </div>
    </div>
    </>
  );
}
