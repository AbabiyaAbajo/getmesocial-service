package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController  //Spring will understand that there are rest endpoint here
@RequestMapping("/api/album") //endpoint path. Methods will start with server/api. (Example: http://localhost:8080/api/album)
public class AlbumResource {

    @Autowired
    private AlbumService aService;


    @PostMapping
    public Album createAlbum(@RequestBody Album a){
        return aService.createAlbum(a);
    }


    @GetMapping
    public List<Album> getAllAlbum() {
        return aService.getAllAlbum();
    }

    @GetMapping("/findById")
    public Optional<Album> getUserById(@RequestParam(name = "albumId") String albumId){
        return aService.getAlbumById(albumId);
    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album a){
        return aService.updateAlbum(a);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "albumid") String albumId){
        aService.deleteAlbum(albumId);
    }

}
