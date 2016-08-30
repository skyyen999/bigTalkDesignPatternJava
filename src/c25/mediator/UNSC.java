package c25.mediator;
/**
 * 聯合國安理會
 * @author Yan
 *
 */
public class UNSC implements UniteNations {
	private USA  countryA;
	private Iraq countryB;
	@Override
	public void declare(String message, Country country) {
		if(country == countryA){
			countryB.getMessage(message);
		} else {
			countryA.getMessage(message);
		}

	}
	
	
	public USA getCountryA() {
		return countryA;
	}
	public void setCountryA(USA countryA) {
		this.countryA = countryA;
	}
	public Iraq getCountryB() {
		return countryB;
	}
	public void setCountryB(Iraq countryB) {
		this.countryB = countryB;
	}

}
