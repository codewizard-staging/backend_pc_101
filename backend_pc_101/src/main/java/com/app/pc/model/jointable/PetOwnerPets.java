package com.app.pc.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.pc.model.Manager;
import com.app.pc.model.Pet;
import com.app.pc.model.PetCareCenter;
import com.app.pc.model.PetOwner;
import com.app.pc.model.Document;
import com.app.pc.model.PetService;
import com.app.pc.enums.PetServiceType;
import com.app.pc.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"pc_451\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}