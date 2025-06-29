package WEEK2.mockingandstubbing.src;

public class ForMock {
        private final ExternalAPI api;

        public ForMock(ExternalAPI api) {
            this.api = api;
        }

        public int add(int n1, int n2) {
            return n1 + n2;
        }

        public int addWithRemote(int n1) {
            int remote = api.fetchRemoteValue();
            return n1 + remote;
        }

        public int subtract(int n1, int n2) {
            return n1 - n2;
        }

        public static void main(String[] args) {
            System.out.println("Hey");
        }
    }


