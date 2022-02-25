import Entities.Patient;
import Entities.Purpose;

public class StartingLogic {
    public static void start(){
        UserService userService = new UserService();
        Patient patient = new Patient("sdfg", "sdfhg", 12, "dfg", "dfh");
        userService.saveUser(patient);
        Purpose purpose = new Purpose();
    }
}
