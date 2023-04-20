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
