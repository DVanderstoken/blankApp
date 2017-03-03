package nc.gouv.dtsi.etudes.axi.cog.commune;

import javax.persistence.metamodel.SingularAttribute;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

public class CommuneSpecification {

	public static Specification<CommuneComplete> isInRegion(final String pCodeRegion) {

		return checkSpec(CommuneComplete_.codeRegion, pCodeRegion);
	}

	public static Specification<CommuneComplete> isInDepartement(final String pCodeDepartement) {

		return checkSpec(CommuneComplete_.codeRegion, pCodeDepartement);
	}

	public static Specification<CommuneComplete> isTheCommune(final String pCodeCommune) {

		return checkSpec(CommuneComplete_.codeRegion, pCodeCommune);
	}

	private static Specification<CommuneComplete> checkSpec(SingularAttribute<Commune, String> propertyName,
			String content) {

		if (StringUtils.trimToNull(content) != null) {

			return (root, query, cb) -> cb.equal(root.get(propertyName), content);

		}

		return null;
	}
}
