import Entities.Patient;

public class UserService {

    private UserDAO usersDao = new UserDAO();

    public UserService() {
    }

    public Patient findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(Patient patient) {
        usersDao.save(patient);
    }

    public void deleteUser(Patient patient) {
        usersDao.delete(patient);
    }

    public void updateUser(Patient patient) {
        usersDao.update(patient);
    }


}