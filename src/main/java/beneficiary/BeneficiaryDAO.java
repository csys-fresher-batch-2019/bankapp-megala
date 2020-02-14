package beneficiary;

import java.util.List;

public interface BeneficiaryDAO {
	public void addBeneficiary(Beneficiary beneficiary) ;
	public List<Beneficiary> displayBeneficiary();
	public void updateBeneficiary(String beneficiaryName,long accNo) ;
	public void deleteBeneficiary(long accNo) ;
}
