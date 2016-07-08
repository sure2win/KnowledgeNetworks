package com.kn.castleblack.common.api.resource;

import com.kn.castleblack.common.api.dto.BaseDTO;
import com.kn.castleblack.common.api.exception.CastleBlackException;
import com.kn.castleblack.common.api.service.BaseService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by kirshnachaitanya.gumma on 28/04/16.
 */

@Data
@Slf4j
@Component
public abstract class AbstractRestResource<T extends BaseDTO, ID extends String> {

    public abstract BaseService<T, ID> getService();

    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response findById(@PathParam("id") String id) {
        T result = getService().findById((ID)id);

        if(result!=null)
            return Response.ok(result).build();
        else
            return Response.noContent().build();
    }

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response findAll(@QueryParam("size") int size, @QueryParam("page") int page) {
        return Response.ok(getService().findAll(new PageRequest(page, size))).build();
    }

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    public Response save(@Valid T dto) {
        try {
            getService().save(dto);
            return Response.status(Response.Status.CREATED).build();
        } catch (CastleBlackException e) {
            e.printStackTrace();
            return Response.serverError().entity(e.getLocalizedMessage()).build();
        }
    }
}
