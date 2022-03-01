package DAO;

import Entities.Purpose;

public class PurposeService {
    private PurposeDAO purposeDAO = new PurposeDAO();

    public PurposeService() {
    }

    public Purpose findUser(int id) {
        return purposeDAO.findById(id);
    }

    public void savePurpose(Purpose purpose) {
        purposeDAO.save(purpose);
    }

    public void deleteUser(Purpose purpose) {
        purposeDAO.delete(purpose);
    }

    public void updateUser(Purpose purpose) {
        purposeDAO.update(purpose);
    }
}
