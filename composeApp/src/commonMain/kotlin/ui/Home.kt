
@Composable
fun Home(event: Event){
    Card(
        modifier = Modifier.size(300.dp).padding(vertical = 10.dp).clickable {

        },
        backgroundColor = Color.Cyan
    ) {
        Column {
            Text(Home)

        }
    }
}
