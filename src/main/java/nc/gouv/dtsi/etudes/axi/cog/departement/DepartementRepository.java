package nc.gouv.dtsi.etudes.axi.cog.departement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository
		extends JpaRepository<Departement, String> {

	Departement findByNomTypoEnrichieOrCodeDepartement(
			final String pNomTypoEnrichie, final String pCodeDepartement);

}
