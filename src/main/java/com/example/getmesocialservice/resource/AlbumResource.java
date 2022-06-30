package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //Spring will understand that there are rest endpoint here
@RequestMapping("/api") //endpoint path. Methods will start with server/api. (Example: http://localhost:8080/api/album)
public class AlbumResource {

    @Autowired
    private AlbumService aService;

    @GetMapping("/album")
    public List<Album> getAllAlbum() {
        return aService.getAllAlbum();

    }

    @GetMapping("/album/{albumId}")
    public Album getUserById(@PathVariable("albumId") int albumId){
        return aService.getAlbumById(albumId);
    }

    @PostMapping("/album")
    public Album createAlbum(@RequestBody Album a){
        return aService.createAlbum(a);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album a){
        return aService.updateAlbum(albumId, a);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "albumid") int albumId){
        return aService.deleteAlbum(albumId);
    }

}
