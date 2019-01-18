/* ==================================================================
 * OsgiDataSourceRealm.java 
 * 
 * 
 * ==================================================================
 */

package org.eniware.common.web.catalina;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.catalina.realm.DataSourceRealm;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class OsgiDataSourceRealm extends DataSourceRealm {

	@Override
	protected Connection open() {
		BundleContext context = FrameworkUtil.getBundle(getClass()).getBundleContext();
		try {
			ServiceReference<?>[] service = context.getServiceReferences(DataSource.class.getName(),
					getDataSourceName());
			if ( service == null || service.length < 1 ) {
				throw new RuntimeException("No " + DataSource.class.getName() + " available");
			}
			DataSource dataSource = (DataSource) context.getService(service[0]);
			return dataSource.getConnection();
		} catch ( SQLException e ) {
			throw new RuntimeException("Error creating DataSource", e);
		} catch ( InvalidSyntaxException e ) {
			throw new RuntimeException("Error creating DataSource", e);
		}
	}

}
