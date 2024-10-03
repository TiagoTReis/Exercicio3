package org.example.demo;

    public class Brinquedo {
        // Atributos
        private String tamanho;
        private String cor;
        private String material;

        // Construtor
        public Brinquedo (String tamanho, String cor, String material) {
            this.tamanho = tamanho;
            this.cor = cor;
            this.material = material;
        }

        // Métodos getters e setters
        public String getTamanho() {
            return tamanho;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        // Método para brincar com os brinquedos
        public void brincar() {
            System.out.println("Brincando com os brinquedos !");
        }

        // Método para guardar os brinquedos
        public void guardar() {
            System.out.println("Guardar os brinquedos!");
        }

        // Método para pegar o brinquedos
        public void pegar() {
            System.out.println("Pegar os brinquedos");
        }

        // Método para exibir informações do brinquedos
        @Override
        public String toString() {
            return "brinquedos [tamanho=" + tamanho + ", cor=" + cor + ", material=" + material + "]";
        }

        // Método principal para testar a classe brinquedos
        public static void main(String[] args) {
            // Criando um objeto brinquedos
            Brinquedo brinquedos = new Brinquedo("pequeno", "amarelo", "plastico");

            // Exibindo informações do brinquedos
            System.out.println(brinquedos);

            // Usando os métodos
            brinquedos.guardar();
            brinquedos.brincar();
            brinquedos.pegar();
        }
    }



