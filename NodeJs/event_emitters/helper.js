const user = function(data) {
    return `${data} is logged in`;
}

const id = function(id) {
    return `${id}`;
}

const email = function(email) {
    return `${email}`;
}

module.exports = {
    user, id, email
}