

    public class Coche {
        private String matricula;
        private String marca;
        private String modelo;
        private double precios;


        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public double getPrecios() {
            return precios;
        }

        public void setPrecios(double precios) {
            this.precios = precios;
        }

        public Coche(String matricula, String marca, String modelo, double precios) {
            this.matricula = matricula;
            this.marca = marca;
            this.modelo = modelo;
            this.precios = precios;



        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Coche coche = (Coche) o;

            if (Double.compare(coche.precios, precios) != 0) return false;
            if (matricula != null ? !matricula.equals(coche.matricula) : coche.matricula != null) return false;
            if (marca != null ? !marca.equals(coche.marca) : coche.marca != null) return false;
            return modelo != null ? modelo.equals(coche.modelo) : coche.modelo == null;

        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = matricula != null ? matricula.hashCode() : 0;
            result = 31 * result + (marca != null ? marca.hashCode() : 0);
            result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
            temp = Double.doubleToLongBits(precios);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return "Coche{" +
                    "matricula='" + matricula + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", precios=" + precios +
                    '}';
        }


    }
