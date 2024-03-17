let p1Health = 100;
let p2Health = 100;
let p1Score = 0;
let p2Score = 0;
let playCount = 0;

function start() {
  let p1Shoot = Math.floor(Math.random() * 5);
  let p2Shoot = Math.floor(Math.random() * 5);

  p1Health -= (p2Shoot * p2Shoot);
  p2Health -= (p1Shoot * p1Shoot);
  
  document.getElementById("play").innerHTML = "Shoot Again";

  document.getElementById("x").innerHTML = `${p1Shoot}`;
  document.getElementById("y").innerHTML = `${p2Shoot}`;
  
  document.getElementById("p1s").innerHTML = `${p1Health}`;
  document.getElementById("p2s").innerHTML = `${p2Health}`;

  if (playCount < 5 && p1Health != 0 && p2Health != 0) {
    if (p1Shoot > p2Shoot) {
      p1Score += 1;
      document.getElementById("p1w").innerHTML = `${p1Score} Times`;
    } else if (p2Shoot > p1Shoot) {
      p2Score += 1;
      document.getElementById("p2w").innerHTML = `${p2Score} Times`;
    }
    playCount++;
  } else {
    document.getElementById("play").disabled = true;
    document.getElementById("play").innerHTML = "Game Over!";
    document.getElementById("play").style.backgroundColor = "rgba(0,0,0,0.1)";

    if (p2Score > p1Score) {
      document.getElementById("pw").innerHTML = `Player-2 Won!`;
    } else if(p1Score> p2Score){
      document.getElementById("pw").innerHTML = `Player-1 Won!`;
    }
        else{
       document.getElementById("pw").innerHTML = `Match Draw!`;
    }
  }
}
