package in.ac.vit.productrating.converters;

import java.util.Set;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;

@Configurable
/**
 * A central place to register application converters and formatters. 
 */
public class ApplicationConversionServiceFactoryBean extends
		FormattingConversionServiceFactoryBean {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void setFormatterRegistrars(Set formatterRegistrars) {
		super.setFormatterRegistrars(formatterRegistrars);
	}

	@Override
	public void afterPropertiesSet() {
		super.afterPropertiesSet();
	}
}
