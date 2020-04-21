package com.pet.clinic.data.services;

import com.pet.clinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
}
