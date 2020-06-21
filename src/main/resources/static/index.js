function getAllStations() {
    window.location.replace("http://localhost:8080/stations");

}
function getStationInfo() {
    var source = document.getElementById("station").value;
    window.location.replace("http://localhost:8080/station/"+source);
}