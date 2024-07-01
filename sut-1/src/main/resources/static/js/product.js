/**
 * 
 */document.addEventListener('DOMContentLoaded', function() {
	var productTitle = document.getElementById("productTitle");
	var productNameInput = document.getElementById('productName');
    	productNameInput.value = productTitle.innerText.trim();
	
    const subcategories = {
        '모카포트': ['200g'],
        '에스프레소': ['200g'],
        '드립커피': ['200g'],
        '더치커피': ['200g']
    };

    document.getElementById('category').addEventListener('change', function() {
        const category = this.value;
        const subcategorySelect = document.getElementById('subcategory');
        subcategorySelect.innerHTML = '<option value="">-- 선택 --</option>';
        
        if (category) {
            const options = subcategories[category];
            options.forEach(option => {
                const optionElement = document.createElement('option');
                optionElement.value = option;
                optionElement.textContent = option;
                subcategorySelect.appendChild(optionElement);
            });
        }
    });

    document.getElementById('quantity').addEventListener('change', updateTotalAmount);

    document.getElementById('btn').addEventListener('click', function() {
        alert('장바구니에 담겼습니다.');
    });

    document.getElementById('purchaseBtn').addEventListener('click', function() {
        alert('구매가 완료되었습니다.');
    });

    function updateTotalAmount() {
        var price = parseInt(document.getElementById('price').value);
        var quantity = parseInt(document.getElementById('quantity').value);
        var totalAmount = price * quantity;
        document.getElementById('totalAmount').textContent = '총 상품금액: ' + totalAmount.toLocaleString() + '원';
    	document.getElementById('productPrice').value = totalAmount;
    	
    	
    	
    	
    	
    	
    
    }
});