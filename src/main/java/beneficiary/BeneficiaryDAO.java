package beneficiary;

import java.util.List;

public interface BeneficiaryDAO {
	public void addBeneficiary(Beneficiary beneficiary) throws Exception;
	public List<Beneficiary> displayBeneficiary() throws Exception;
	public void updateBeneficiary(String beneficiaryName,int accNo) throws Exception;
	public void deleteBeneficiary(int accNo) throws Exception;
}
