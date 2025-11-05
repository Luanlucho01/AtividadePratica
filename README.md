<h2 align="center">Modelo 1:1</h2>

<p align="center">1:1 - 10 Threads: 516ms</p>
<p align="center"><img src="UM10.png" width="400"></p>

<p align="center">1:1 - 100 Threads: 524ms</p>
<p align="center"><img src="UM100.png" width="400"></p>

<p align="center">1:1 - 500 Threads: 582ms</p>
<p align="center"><img src="UM500.png" width="400"></p>

<p align="center">1:1 - 1000 Threads: 618ms</p>
<p align="center"><img src="UM1000.png" width="400"></p>

---

<h2 align="center">Modelo N:M (4 threads reais)</h2>

<p align="center">M:N - 10 Threads: 313ms</p>
<p align="center"><img src="MN10.png" width="400"></p>

<p align="center">M:N - 100 Threads: 2536ms</p>
<p align="center"><img src="MN100.png" width="400"></p>

<p align="center">M:N - 500 Threads: 12614ms</p>
<p align="center"><img src="MN500.png" width="400"></p>

<p align="center">M:N - 1000 Threads: 25209ms</p>
<p align="center"><img src="MN1000.png" width="400"></p>

---

<h2 align="center">Gráfico Comparativo</h2>

<p align="center"><img src="grafico.png" width="500"></p>

---

O modelo **N:M** apresentou vantagem apenas com poucas threads (até cerca de 10), pois o custo de troca entre threads ainda é baixo e há aproveitamento do paralelismo.  
Conforme o número de threads de usuário cresce, o modelo **1:1** torna-se mais eficiente, já que evita a sobrecarga de multiplexação e aproveita melhor os núcleos disponíveis do sistema operacional.
