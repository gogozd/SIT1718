public class SpaceShip {

        private String name;
        private int id;

        public SpaceShip(String string, int i) {
                // TODO Auto-generated constructor stub
                name = string;
                id = i;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getMissions() {
                return id;
        }

        public void setMissions(int missions) {
                this.id = missions;
        }

}