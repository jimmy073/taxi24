package taxi24.jim.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServerApplication.class)
public class ServerApplicationTests {
	@Autowired
	DataSource dataSource;
	@Test
	@Sql({"/data.sql"})
	public void testDummy() throws SQLException {
		String schema = dataSource.getConnection().getCatalog();
		assertTrue("taxi".equalsIgnoreCase(schema));
	}

}
