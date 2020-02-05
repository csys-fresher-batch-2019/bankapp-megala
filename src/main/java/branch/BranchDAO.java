package branch;

import java.util.List;

public interface BranchDAO {
	void addBranch(Branch branch) throws Exception;
    List<Branch> list() throws Exception;
    void updateBranch(String Name,int Id) throws Exception;
    void delete(int Id) throws Exception;
    
}
