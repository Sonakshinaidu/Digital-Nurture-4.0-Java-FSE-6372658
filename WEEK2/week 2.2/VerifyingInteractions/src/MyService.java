package WEEK2.VerifyingInteractions.src;

public class MyService {

        public interface ExternalApi2 {
            void getData();
        }

        private final ExternalApi2 api;

        public MyService(ExternalApi2 api) {
            this.api = api;
        }

        public void fetchData() {
            api.getData();
        }

        // ✅ Add this method to run the class from IntelliJ
        public static void main(String[] args) {
            ExternalApi2 mockApi = new ExternalApi2() {
                @Override
                public void getData() {
                    System.out.println("Fetching data from mock API...");
                }
            };

            MyService service = new MyService(mockApi);
            service.fetchData();  // Output: Fetching data from mock API...
        }
    }






