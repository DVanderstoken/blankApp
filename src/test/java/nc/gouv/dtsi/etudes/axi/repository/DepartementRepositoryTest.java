package nc.gouv.dtsi.etudes.axi.repository;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import nc.gouv.dtsi.etudes.axi.BlankAppApplicationTests;
import nc.gouv.dtsi.etudes.axi.cog.departement.Departement;
import nc.gouv.dtsi.etudes.axi.cog.departement.DepartementRepository;

public class DepartementRepositoryTest extends BlankAppApplicationTests {

	@Autowired
	private DepartementRepository lDepartementRepository;

	@Test
	public void shouldReturnNonEmptyDepartementList() {

		List<Departement> departements = lDepartementRepository.findAll();

		assertFalse(departements.isEmpty());

		for (Departement departement : departements) {

			String code = departement.getCodeDepartement();

			assertFalse(code == null);
		}

	}

}
