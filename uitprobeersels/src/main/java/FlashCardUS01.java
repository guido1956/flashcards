public class FlashCardUS01 {

        private String voorkant;
        private String achterkant;

        //constructor 1
        public FlashCardUS01() {
            voorkant = "";
            achterkant = "";
        }

        // constructor 2
        public FlashCardUS01(String voorkant, String achterkant) {
            this.voorkant = voorkant;
            this.achterkant = achterkant;
        }

        public String getVoorkant() {
            return voorkant;
        }

        public void setVoorkant(String voorkant) {
            this.voorkant = voorkant;
        }

        public String getAchterkant() {
            return achterkant;
        }

        public void setAchterkant(String achterkant) {
            this.achterkant = achterkant;
        }
    }




