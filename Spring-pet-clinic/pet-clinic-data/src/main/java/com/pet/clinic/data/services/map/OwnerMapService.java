package com.pet.clinic.data.services.map;

import java.util.Set;

import com.pet.clinic.data.model.Owner;
import com.pet.clinic.data.services.CrudService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {

		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {

		return super.findById(id);
	}

	@Override
	Owner save(Long id, Owner object) {

		return super.save(id, object);
	}

	@Override
	public void delete(Owner object) {

		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {

		super.deleteById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(),object);
	}
}
