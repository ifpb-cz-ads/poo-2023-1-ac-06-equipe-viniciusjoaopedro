## 6.03 Atividade colaborativa

## 🤝 Alunos: Vinícius da Silva Ribeiro e Joao Pedro Oliveira Santos

Respostas das seguintes questões:

- Livro Batista e Moraes (2013): questões 1 a 9 (páginas 78 a 80);
- Livro Chagas, Baruque & Baruque (2010): atividades práticas 1 (pág. 108), 2 (pág. 109), 3 (pág. 110) e 4 (pág. 116).

---
### ✔️ Questão 1) Os dados que devem ser representados por esse modelo devem ser:
  * Marca da lâmpada
  * Tipo de lâmpada
  * Potência
  * Cor da luz
  * Vida útil
  * Preço
  * Disponibilidade no estoque

```java
class Lamp {
    private String brand;
    private String type;
    private int power;
    private int colorTemperature;
    private int lifespan;
    private double price;
    private boolean availability;
    
    // Construtor da classe Lamp
    public Lamp(String brand, String type, int power, int colorTemperature, int lifespan, double price, boolean availability) {
        this.brand = brand;
        this.type = type;
        this.power = power;
        this.colorTemperature = colorTemperature;
        this.lifespan = lifespan;
        this.price = price;
        this.availability = availability;
    }
    
    // Getters e setters para os dados da lâmpada
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getPower() {
        return power;
    }
    
    public void setPower(int power) {
        this.power = power;
    }
    
    public int getColorTemperature() {
        return colorTemperature;
    }
    
    public void setColorTemperature(int colorTemperature) {
        this.colorTemperature = colorTemperature;
    }
    
    public int getLifespan() {
        return lifespan;
    }
    
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean isAvailable() {
        return availability;
    }
    
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
```

---

### ✔️ Questão 2)
#### Os dados que esse modelo deve ter são os seguintes:
* Nome do time
* País de origem do time
* Lista de jogadores do time
* Técnico do time
* Pontuação atual do time no campeonato

#### E as operações:
* Adicionar um novo jogador à lista de jogadores do time
* Remover um jogador da lista de jogadores do time
* Atualizar a pontuação do time após uma partida
* Obter a lista de jogadores do time
* Obter a pontuação atual do time no campeonato
* Obter o nome do técnico do time
* Alterar o nome do time
* Alterar o país de origem do time

```java
public class Team {
    private String name;
    private String country;
    private List<Player> players;
    private Coach coach;
    private int score;
    
    public Team(String name, String country, List<Player> players, Coach coach) {
        this.name = name;
        this.country = country;
        this.players = players;
        this.coach = coach;
        this.score = 0;
    }
    
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public void removePlayer(Player player) {
        players.remove(player);
    }
    
    public void updateScore(int points) {
        score += points;
    }
    
    public List<Player> getPlayers() {
        return players;
    }
    
    public int getScore() {
        return score;
    }
    
    public String getCoachName() {
        return coach.getName();
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
}
```

---

### ✔️ Questão 7) A classe apresentada possui apenas um erro, que consiste na ausência de especificação de modificadores de acesso para os campos de classe. É crucial definir os modificadores de acesso para esses campos, a fim de que sejam acessados de maneira apropriada tanto dentro quanto fora da classe.

---

### ✔️ Questão 8) Há dois erros no código:
1. O método `maior` está definido como retornando um `int`, mas na verdade está retornando um valor booleano (`true` ou `false`). O tipo de retorno deve ser alterado para `boolean`.
2. O método `menor` está definido como retornando `void`, mas na verdade está tentando retornar um valor inteiro (`num1` ou `num2`). O tipo de retorno deve ser alterado para `int`.
