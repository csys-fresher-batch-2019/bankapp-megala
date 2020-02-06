package beneficiary;

import java.util.List;

public interface BeneficiaryDAO {
	public void addBeneficiary(Beneficiary beneficiary) ;
	public List<Beneficiary> displayBeneficiary();
	public void updateBeneficiary(String beneficiaryName,int accNo) ;
	public void deleteBeneficiary(int accNo) ;
}
