function setTable() {

    const rows = document.getElementById("rowInput").value;
    const cols = document.getElementById("colInput").value;
   
    const table = document.createElement("table");
   
    for (let i = 0; i < rows; i++) {
        const tr = document.createElement("tr");
        for (let j = 0; j < cols; j++) {
            const td = document.createElement("td");
            td.textContent = `${i+1}행${j+1}열`;
            tr.appendChild(td);
        }
        table.appendChild(tr);
    }
   
    const tableDiv = document.querySelector(".table-div");
    tableDiv.innerHTML = ""; 
   

    tableDiv.appendChild(table);
  }