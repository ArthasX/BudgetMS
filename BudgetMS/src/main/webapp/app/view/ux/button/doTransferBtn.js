Ext.define('BudgetMS.view.ux.button.doTransferBtn', {
	extend : 'BudgetMS.view.ux.button.baseBtn',
	alias:'widget.doTransferBtn',
	listeners : {
		'click' : function(btn, e, eOpts) {
			//debugger;
			var tabpanel = Ext.getCmp('mainTabpanel');
			var tab = tabpanel.getActiveTab();
			var grid = tab.down('gridview');
			var url = btn.action;
			this.doCRUDAjax('', url, grid);
		}
	}
});