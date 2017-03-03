package nc.gouv.dtsi.etudes.axi.cog.commune;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommuneRepository
		extends JpaRepository<CommuneComplete, CommuneId>, JpaSpecificationExecutor<CommuneComplete> {

}
