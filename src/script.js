let cartItems = [];

function addToCart(product) {
    cartItems.push(product);
    renderCart();
}

function renderCart() {
    const cartList = document.getElementById('cart-items');
    cartList.innerHTML = '';
    cartItems.forEach(item => {
        const li = document.createElement('li');
        li.textContent = item;
        cartList.appendChild(li);
    });
}

function checkout() {
    alert('Thank you for your purchase!');
    cartItems = [];
    renderCart();
}
