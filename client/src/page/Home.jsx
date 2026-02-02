 import React, { useEffect, useState } from "react";

function Home() {
  let [f, setF] = useState("🍎");

  useEffect(() => {
    if (f === "🍎") {
      setF("🍏");
    } else {
      setF("🍎");
    }
    console.log(` fruit f : ${f} `);
  },[f]);

  return (
    <>
      <div>
        <h1>Fruit : {f}</h1>
      </div>
    </>
  );
}

export default Home;
