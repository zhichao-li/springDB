package springDB.dao;

import java.util.Collection;

import org.springframework.jdbc.core.JdbcTemplate;

import springDB.domain.BiasingAudit;

public class BiasingAuditDAOImpl implements IBiasingAuditDAO{
	private JdbcTemplate jdbcTemplate;

	public BiasingAuditDAOImpl(JdbcTemplate jdbcTemplate ){
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public Collection<BiasingAudit> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
