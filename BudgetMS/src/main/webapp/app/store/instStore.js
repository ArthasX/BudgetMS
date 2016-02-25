
Ext.define('BudgetMS.store.instStore', {
	extend : 'Ext.data.Store',
	// fields : [ 'instId', 'instTitle' ],
	model : 'BudgetMS.model.inst',
	// data : [ {
	// instId : 'Ed',
	// instTitle : 'ed@sencha.com'
	// }, {
	// instId : 'Tommy',
	// instTitle : 'tommy@sencha.com'
	// } ]
	pageSize: PAGE_SIZE,
	proxy : {
		type : 'ajax',
		url : 'inst/getAllInst.do',
		reader : {
			type : 'json'
		// root : 'root'
		},
		extraParams:[]//在controller中添加事件，然后按照
	},
	autoLoad : {
		start : 0,
		limit : PAGE_SIZE
	}
});

// fields:'',
