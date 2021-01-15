function newpost_button() {
    let form_visibility = document.getElementById("newpost_form").hidden;
    document.getElementById("newpost_form").hidden = !form_visibility;
    document.getElementById("newpost_button").textContent = form_visibility ? "Hide form" : "New post";
}

async function submit_post() {
    let title = document.getElementById("post_title");
    let text = document.getElementById("post_text");
    let author = document.getElementById("post_author");
    let form_data = new FormData();
    form_data.append("title", title);
    form_data.append("content", text);
    form_data.append("author", author);
    let response = await fetch('/', {method: "POST", body: form_data});
    fetch('/', {method: "GET"});
}