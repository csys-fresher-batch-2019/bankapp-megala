package branch;

import java.util.List;

public interface BranchDAO {
	void addBranch(Branch branch);
    List<Branch> list() ;
    void updateBranch(String Name,int Id) ;
    void delete(int Id) ;
    
}
