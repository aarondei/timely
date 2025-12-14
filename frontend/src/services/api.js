// src/services/api.js
export const getSchedule = async () => {
  const res = await fetch('/api/schedule'); // '/api' will proxy to backend
  if (!res.ok) throw new Error('Failed to fetch schedule');
  return res.json();
};

  